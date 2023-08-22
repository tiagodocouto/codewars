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

package io.github.tiagodocouto.codewars.mask

import io.github.tiagodocouto.helper.AssertExtensions.shouldBe
import org.junit.jupiter.api.Test

/**
 * [Alternate capitalization](https://www.codewars.com/kata/59cfc000aeb2844d16000075)
 */
class AlternateCapitalizationTest {
    @Test
    fun `should alternate capitalize a string`() {
        AlternateCapitalization.capitalize("abcdef") shouldBe listOf("AbCdEf", "aBcDeF")
        AlternateCapitalization.capitalize("codewars") shouldBe listOf("CoDeWaRs", "cOdEwArS")
        AlternateCapitalization.capitalize("abracadabra") shouldBe listOf("AbRaCaDaBrA", "aBrAcAdAbRa")
        AlternateCapitalization.capitalize("codewarriors") shouldBe listOf("CoDeWaRrIoRs", "cOdEwArRiOrS")
    }
}
