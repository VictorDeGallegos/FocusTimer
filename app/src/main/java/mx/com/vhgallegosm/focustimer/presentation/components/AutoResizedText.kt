package mx.com.vhgallegosm.focustimer.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import mx.com.vhgallegosm.focustimer.presentation.theme.FocusTimerTheme
import mx.com.vhgallegosm.focustimer.presentation.theme.Typography

@Composable
fun AutoResizedText(
    modifier: Modifier = Modifier,
    text: String,
    textStyle: TextStyle = Typography.displayLarge
) {
    var timeTextStyle by remember { mutableStateOf(textStyle) }
    val fontSizeFactor = 0.95
    Text(
        text,
        modifier = modifier.fillMaxWidth(),
        softWrap = false,
        style = timeTextStyle,
        onTextLayout = { result ->
            if (result.didOverflowWidth) {
                timeTextStyle = timeTextStyle.copy(
                    fontSize = timeTextStyle.fontSize * fontSizeFactor
                )
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun AutoResizedTextPreview() {
    FocusTimerTheme {
        AutoResizedText(
            text = "Focus Timer"
        )
    }
}