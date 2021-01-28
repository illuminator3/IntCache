package me.illuminator3.intcache;

import java.lang.reflect.Field;

/**
 * <p>Util class for modifying the integer cache.
 * <p>You can e.g. set 4 to 5 so that 2 + 2 = 5
 * <p>^ Code for that:
 * <pre>
 * IntCache.modify(4, 5); // set number 4 to number 5
 *
 * int num = 2 + 2;
 * //  ^ num == 5
 * </pre>
 *
 * @see java.lang.Integer
 * @see java.lang.Integer.IntegerCache
 */
public class IntCache
{
    private static final Integer[] cache;
    private static final int low = -128;

    static {
        try
        {
            Class<? /* IntegerCache */> cls = Integer.class.getDeclaredClasses()[0];
            Field c = cls.getDeclaredField("cache");

            c.setAccessible(true);

            cache = (Integer[]) c.get(cls);
        } catch (IllegalAccessException | NoSuchFieldException ex)
        {
            throw new ExceptionInInitializerError("Errors accessing the integer cache");
        }
    }

    private IntCache() {}

    /**
     * <p>Translates the given number to the position in the integer cache.
     *
     * <p>The method is defined as the following:
     * <pre>
     * translate(n) = n + (-low())
     * </pre>
     *
     * Examples:
     * <pre>
     * ...
     * translate(-1) = 127
     * translate(+0) = 128
     * translate(+1) = 129
     * ...
     * </pre>
     * @param i The number
     * @return The index in the integer cache array
     */
    public static int translate(int i)
    {
        return i + (-low());
    }

    /**
     * <p>Switches both numbers in the cache
     *
     * <p>The method is defined as the following:
     * <pre>
     * switchNumbers(n1, n2):
     *     modify(n1, n2)
     *     modify(n2, n1)
     * </pre>
     *
     * Example:
     * <pre>
     * switchNumbers(4, 5)
     *
     * 2 + 2 == 5 // true
     * 2 + 3 == 4 // true
     *
     * 2 + 2 == 4 // false
     * 2 + 3 == 5 // false
     * </pre>
     * @param n1 First number
     * @param n2 Second number
     */
    public static void switchNumbers(int n1, int n2)
    {
        modify(n1, n2);
        modify(n2, n1);
    }

    /**
     * <p>Modifies the number {@code from} to be set to {@code to}
     *
     * <p>The method is defined as the following:
     * <pre>
     * modify(from, to) = set(translate(from), to)
     * </pre>
     *
     * Example:
     * <pre>
     * modify(4, 5)
     *
     * num = 2 + 2
     * ^ num == 5
     * </pre>
     * @param from From
     * @param to To
     */
    public static void modify(int from, int to)
    {
        set(translate(from), to);
    }

    /**
     * <p>Sets the integer at the position {@code pos} to be {@code i} in the integer cache
     * @param pos The index
     * @param i The value
     */
    public static void set(int pos, int i)
    {
        cache[pos] = i;
    }

    /**
     * <p>The low value is used for determiting the array offset of a number in the integer cache.
     * <p>The default low value is set to -128
     * @return The current low value
     */
    public static int low()
    {
        return low;
    }
}