package mx.com.vhgallegosm.focustimer.presentation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import mx.com.vhgallegosm.focustimer.presentation.theme.FocusTimerTheme

@Composable
fun TimerTypeItem(
    modifier: Modifier = Modifier,
    text: String,
    textColor: Color,
    onTap: () -> Unit = {}
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(FocusTimerTheme.dimens.paddingSmall)
            .clickable { onTap() },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center),
            color = textColor,
        )
    }
}

@Preview(
    name = "TimerTypeItemPreview",
    showBackground = true,
)
@Composable
fun TimerTypeItemPreview() {
    FocusTimerTheme {
        TimerTypeItem(
            text = "Focus",
            textColor = Color.Black
        )
    }
}