------------------------------------------------------------------------
This is the project README file. 
------------------------------------------------------------------------

PROJECT TITLE:A special Roman To Arabic 
PURPOSE OF PROJECT:Test2 for Centiglobe
VERSION or DATE:10/16/2019
HOW TO START THIS PROJECT:Please run the JavaFX Application 
AUTHORS: Ida
USER INSTRUCTIONS:
1-First choose the type of conversion (Arabic to Roman) or (Roman to Arabic )
2-Write the number in the textbox.
3-Click on the ok button.


The program translates a roman number (<3000) the user inputs
into an Arabic number(regular numbers). If the user inputs a non valid
roman number the user should be informed.

Test Description:
All basic symbols and the corresponding value are:

Symbol  Value
I       1
V       5
X       10
L       50
C       100
D       500
M       1000

A larger symbol (M) before a smaller symbol (C) means addition
(MC=1100). A smaller symbol before a larger means subtraction (CM=900)

To get one to one mapping between arabic and roman numerals, the
following rules must also apply:
*    The symbols "I", "X", "C", and "M" can be repeated two times in
succession, but no more. (They may appear three times if the second
and third are separated by a smaller value, such as XXIX.) "D", "L",
and "V" can never be repeated.
*   "I" can be subtracted from "V" and "X" only. "X" can be subtracted
from "L" and "C" only. "C" can be subtracted from "D" and "M" only.
"V", "L", and "D" can never be subtracted.
*    Maximum two small-value symbol may be subtracted from any
large-value symbol, i.e CCD = 300.
*    A number written in Arabic numerals can be broken into digits.
For example, 1903 is composed of 1, 9, 0, and 3. To write the Roman
numeral, each of the non-zero digits should be treated separately. In
the above example, 1,000 = M, 900 = CM, and 3 = IIV. Therefore, 1903 = MCMIIV.

By following these rules the first eleven numbers are:
I       1
II      2
IIV     3
IV      4
V       5
VI      6
VII     7
IIX     8
IX      9
X       10
XI      11

And continues in that way up to 2999
For example MMCMLXIIV = 1000 + 1000 + (1000 - 100) + 50 + 10 + (5 - 2) = 2963
 