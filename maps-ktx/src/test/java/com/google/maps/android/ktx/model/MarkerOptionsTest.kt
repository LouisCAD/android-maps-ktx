/*
 * Copyright 2020 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.google.maps.android.ktx.model

import com.google.android.gms.maps.model.LatLng
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class MarkerOptionsTest {

    @Test
    fun testBuilder() {
        val markerOptions = markerOptions {
            position(LatLng(1.0, 2.0))
            alpha(0.5f)
            draggable(false)
            flat(true)
            title("Test")
            snippet("Snippet")
            visible(true)
        }
        assertEquals(LatLng(1.0, 2.0), markerOptions.position)
        assertEquals(0.5f, markerOptions.alpha, 1e-6f)
        assertFalse(markerOptions.isDraggable)
        assertTrue(markerOptions.isFlat)
        assertEquals("Test", markerOptions.title)
        assertEquals("Snippet", markerOptions.snippet)
        assertTrue(markerOptions.isVisible)
    }
}
