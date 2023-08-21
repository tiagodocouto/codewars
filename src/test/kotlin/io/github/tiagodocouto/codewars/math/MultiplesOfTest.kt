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

package io.github.tiagodocouto.codewars.math

import io.github.tiagodocouto.codewars.math.MultiplesOf.sumMultiplesOf
import io.github.tiagodocouto.codewars.math.MultiplesOf.sumMultiplesOf3Or5
import io.github.tiagodocouto.helpers.AssertExtensions.shouldBe
import org.junit.jupiter.api.Test

/**
 * [Multiples of 3 or 5](https://www.codewars.com/kata/514b92a657cdc65150000006)
 */
class MultiplesOfTest {
    @Test
    fun `sum of multiples of 3 and 5`() {
        10.sumMultiplesOf3Or5() shouldBe 23
        20.sumMultiplesOf3Or5() shouldBe 78
        200.sumMultiplesOf3Or5() shouldBe 9168
    }

    @Test
    fun `sum of multiples of 2`() {
        10.sumMultiplesOf(2) shouldBe 20
        1.sumMultiplesOf(2) shouldBe 0
    }
}