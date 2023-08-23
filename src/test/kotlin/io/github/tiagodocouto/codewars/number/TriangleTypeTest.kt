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

import io.github.tiagodocouto.helper.AssertExtensions.shouldBe
import org.junit.jupiter.api.Test

class TriangleTypeTest {
    @Test
    fun `should not be a triangle`() {
        TriangleType.type(7.0, 3.0, 2.0) shouldBe 0
        TriangleType.type(2.0, 4.0, 6.0) shouldBe 0
    }

    @Test
    fun `should be an acute triangle`() {
        TriangleType.type(8.0, 5.0, 7.0) shouldBe 1
        TriangleType.type(7.0, 8.0, 5.0) shouldBe 1
    }

    @Test
    fun `should be a right triangle`() {
        TriangleType.type(3.0, 4.0, 5.0) shouldBe 2
        TriangleType.type(5.0, 3.0, 4.0) shouldBe 2
    }

    @Test
    fun `should be an obtuse triangle`() {
        TriangleType.type(7.0, 12.0, 8.0) shouldBe 3
        TriangleType.type(12.0, 8.0, 7.0) shouldBe 3
    }
}
