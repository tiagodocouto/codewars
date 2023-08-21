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

import io.github.tiagodocouto.codewars.math.PascalTriangle.findPascalNumberOn
import io.github.tiagodocouto.helpers.AssertExtensions.shouldBe
import org.junit.jupiter.api.Test

class PascalTriangleTest {
    @Test
    fun `calculate Pascal Triangle`() {
        findPascalNumberOn(3000, 10) shouldBe "53593460098946373964842000"
        findPascalNumberOn(1250, 25) shouldBe "273297579454913577982090871768615134079835893782500"
        findPascalNumberOn(2295, 10) shouldBe "4791376379040754076012010"
        findPascalNumberOn(2000, 5) shouldBe "664668499500"
    }
}

