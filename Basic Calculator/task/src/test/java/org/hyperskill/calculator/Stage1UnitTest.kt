package org.hyperskill.calculator

import android.widget.Button
import android.widget.EditText
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class Stage1UnitTest {

    private val activityController = Robolectric.buildActivity(MainActivity::class.java)

    @Test
    fun testShouldCheckEditTextExist() {
        val activity = activityController.setup().get()
        val editText = activity.findViewById<EditText>(R.id.editText)

        val message = "does view with id \"editText\" placed in activity?"
        assertNotNull(message, editText)
    }

    @Test
    fun testShouldCheckEditTextContainNothing() {
        val activity = activityController.setup().get()
        val editText = activity.findViewById<EditText>(R.id.editText)
        val textLength = editText.text.toString().length
        val message = "the editText with id \"editText\" contains some characters in the property text. There should be none"
        assertEquals(message, 0, textLength)
    }

    @Test
    fun testShouldCheckEditTextHintIsSetToZero() {
        val activity = activityController.setup().get()
        val editText = activity.findViewById<EditText>(R.id.editText)
        val hint = editText.hint.toString().toInt()
        val message = "check whether editText with id \"editText\" has 0 set as a hint"
        assertEquals(message, 0, hint)
    }

    @Test
    fun testShouldCheckButtonsExist() {
        val activity = activityController.setup().get()
        val button0 = activity.findViewById<Button>(R.id.button0)
        val button1 = activity.findViewById<Button>(R.id.button1)
        val button2 = activity.findViewById<Button>(R.id.button2)
        val button3 = activity.findViewById<Button>(R.id.button3)
        val button4 = activity.findViewById<Button>(R.id.button4)
        val button5 = activity.findViewById<Button>(R.id.button5)
        val button6 = activity.findViewById<Button>(R.id.button6)
        val button7 = activity.findViewById<Button>(R.id.button7)
        val button8 = activity.findViewById<Button>(R.id.button8)
        val button9 = activity.findViewById<Button>(R.id.button9)
        val clearButton = activity.findViewById<Button>(R.id.clearButton)
        val equalButton = activity.findViewById<Button>(R.id.equalButton)
        val addButton = activity.findViewById<Button>(R.id.addButton)
        val subtractButton = activity.findViewById<Button>(R.id.subtractButton)
        val multiplyButton = activity.findViewById<Button>(R.id.multiplyButton)
        val divideButton = activity.findViewById<Button>(R.id.divideButton)
        val dotButton = activity.findViewById<Button>(R.id.dotButton)

        val message = "is view with id \"button0\" placed in activity?"
        assertNotNull(message, button0)
        val message1 = "is view with id \"button1\" placed in activity?"
        assertNotNull(message, button1)
        val message2 = "is view with id \"button2\" placed in activity?"
        assertNotNull(message, button2)
        val message3 = "is view with id \"button3\" placed in activity?"
        assertNotNull(message, button3)
        val message4 = "is view with id \"button4\" placed in activity?"
        assertNotNull(message, button4)
        val message5 = "is view with id \"button5\" placed in activity?"
        assertNotNull(message, button5)
        val message6 = "is view with id \"button6\" placed in activity?"
        assertNotNull(message, button6)
        val message7 = "is view with id \"button7\" placed in activity?"
        assertNotNull(message, button7)
        val message8 = "is view with id \"button8\" placed in activity?"
        assertNotNull(message, button8)
        val message9 = "is view with id \"button9\" placed in activity?"
        assertNotNull(message, button9)
        val message10 = "is view with id \"clearButton\" placed in activity?"
        assertNotNull(message, clearButton)
        val message11 = "is view with id \"equalButton\" placed in activity?"
        assertNotNull(message, equalButton)
        val message12 = "is view with id \"addButton\" placed in activity?"
        assertNotNull(message, addButton)
        val message13 = "is view with id \"divideButton\" placed in activity?"
        assertNotNull(message, divideButton)
        val message14 = "is view with id \"subtractButton\" placed in activity?"
        assertNotNull(message, subtractButton)
        val message15 = "is view with id \"multiplyButton\" placed in activity?"
        assertNotNull(message, multiplyButton)
        val message16 = "is view with id \"dotButton\" placed in activity?"
        assertNotNull(message, dotButton)
    }

    @Test
    fun testShouldCheckButtonsText() {
        val activity = activityController.setup().get()

        val message = "in button0 property \"text\""
        assertEquals(message, "0", activity.findViewById<Button>(R.id.button0).text)
        val message1 = "in button1 property \"text\""
        assertEquals(message, "1", activity.findViewById<Button>(R.id.button1).text)
        val message2 = "in button2 property \"text\""
        assertEquals(message, "2", activity.findViewById<Button>(R.id.button2).text)
        val message3 = "in button3 property \"text\""
        assertEquals(message, "3", activity.findViewById<Button>(R.id.button3).text)
        val message4 = "in button4 property \"text\""
        assertEquals(message, "4", activity.findViewById<Button>(R.id.button4).text)
        val message5 = "in button5 property \"text\""
        assertEquals(message, "5", activity.findViewById<Button>(R.id.button5).text)
        val message6 = "in button6 property \"text\""
        assertEquals(message, "6", activity.findViewById<Button>(R.id.button6).text)
        val message7 = "in button7 property \"text\""
        assertEquals(message, "7", activity.findViewById<Button>(R.id.button7).text)
        val message8 = "in button8 property \"text\""
        assertEquals(message, "8", activity.findViewById<Button>(R.id.button8).text)
        val message9 = "in button9 property \"text\""
        assertEquals(message, "9", activity.findViewById<Button>(R.id.button9).text)
    }

}