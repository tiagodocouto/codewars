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

import io.github.tiagodocouto.helper.AssertExtensions.shouldBe
import org.junit.jupiter.api.Test

/**
 * [Tortoise Racing](https://www.codewars.com/kata/55e2adece53b4cdcb900006c)
 */
class TortoiseRacingTest {
    @Test
    fun `eventually should win the race`() {
        TortoiseRacing.race(720, 850, 70) shouldBe intArrayOf(0, 32, 18)
        TortoiseRacing.race(80, 91, 37) shouldBe intArrayOf(3, 21, 49)
        TortoiseRacing.race(100, 120, 100) shouldBe intArrayOf(5, 0, 0)
        TortoiseRacing.race(466, 1139, 89) shouldBe intArrayOf(0, 7, 56)
        TortoiseRacing.race(202, 811, 143) shouldBe intArrayOf(0, 14, 5)
        TortoiseRacing.race(720, 850, 37) shouldBe intArrayOf(0, 17, 4)
        TortoiseRacing.race(420, 1010, 137) shouldBe intArrayOf(0, 13, 55)
        TortoiseRacing.race(574, 664, 134) shouldBe intArrayOf(1, 29, 20)
        TortoiseRacing.race(572, 843, 95) shouldBe intArrayOf(0, 21, 1)
    }

    @Test
    fun `should not win the race`() {
        TortoiseRacing.race(820, 81, 550) shouldBe intArrayOf()
    }
}
