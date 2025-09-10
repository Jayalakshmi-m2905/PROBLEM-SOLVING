📖 Description

The goal is to reverse the digits of an integer while handling negative numbers and overflow conditions. For example:

Input: 123 → Output: 321

Input: -456 → Output: -654

Input: 1534236469 (overflow when reversed) → Output: 0

Your code works by converting the number into a string, reversing its digits manually, and then converting it back to an integer while checking for overflow.

⚙️ Approach

Handle zero case: If x == 0, return 0 immediately.

Store sign: Save the original input as a string b to detect negative numbers later.

Work with absolute value: Use Math.abs(x) so only digits are reversed.

Build reversed string:

Use modulo % 10 to extract the last digit.

Append digit to res.

Divide x by 10 until no digits remain.

Convert back to integer:

Use Integer.parseInt(res) to turn reversed string into integer.

If original number was negative, add a negative sign.

Handle overflow:

If parsing causes a NumberFormatException, return 0 (since result exceeded int range).

✅ Pros of This Approach

Readable & Simple: Easy to understand, since it uses string manipulation and basic math.

Handles negatives correctly: Works for both positive and negative integers.

Overflow safety: Using try–catch ensures no runtime crash when reversed number is outside 32-bit integer range.

Step-by-step digit extraction: Shows a clear understanding of modulo/division for digit processing.
