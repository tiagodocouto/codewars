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

package io.github.tiagodocouto.codewars.path

import io.github.tiagodocouto.codewars.path.TakeATenMinutesWalk.isValidWalk
import io.github.tiagodocouto.helpers.AssertExtensions.shouldBe
import org.junit.jupiter.api.Test

/**
 * [Take a Ten Minutes Walk](https://www.codewars.com/kata/54da539698b8a2ad76000228)
 */
class TakeATenMinutesWalkTest {
    @Test
    fun `should take a ten minutes`() {
        listOf('n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's').isValidWalk() shouldBe true
    }

    @Test
    fun `should not take a ten minutes`() {
        listOf('n', 's', 'e', 'w').isValidWalk() shouldBe false
        listOf('w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e').isValidWalk() shouldBe false
        listOf('w').isValidWalk() shouldBe false
        listOf('n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's').isValidWalk() shouldBe false
    }
}