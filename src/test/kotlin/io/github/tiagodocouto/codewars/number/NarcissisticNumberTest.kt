/*
 * Copyright (c) 2023 Tiago do Couto.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF
 * CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE
 * OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package io.github.tiagodocouto.codewars.number

import io.github.tiagodocouto.codewars.number.NarcissisticNumber.isNarcissistic
import io.github.tiagodocouto.helper.AssertExtensions.shouldBeFalse
import io.github.tiagodocouto.helper.AssertExtensions.shouldBeTrue
import org.junit.jupiter.api.Test

/**
 * [Narcissistic Numbers](https://www.codewars.com/kata/5743f4ab03fa4a66a300020b#)
 */
class NarcissisticNumberTest {
    @Test
    fun `numbers should be narcissistic`() {
        isNarcissistic(1).shouldBeTrue()
        isNarcissistic(153).shouldBeTrue()
        isNarcissistic(370).shouldBeTrue()
    }

    @Test
    fun `numbers should not be narcissistic`() {
        isNarcissistic(324).shouldBeFalse()
        isNarcissistic(435).shouldBeFalse()
        isNarcissistic(5555).shouldBeFalse()
    }
}