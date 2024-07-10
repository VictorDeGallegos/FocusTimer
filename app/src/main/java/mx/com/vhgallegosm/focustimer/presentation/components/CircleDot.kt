package mx.com.vhgallegosm.focustimer.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import mx.com.vhgallegosm.focustimer.presentation.theme.FocusTimerTheme

@Composable
fun CircleDot(
    color: Color = MaterialTheme.colorScheme.primary,
    modifier: Modifier = Modifier
) {
    Box {
        Box(
            modifier = modifier
                .size(FocusTimerTheme.dimens.iconSizeSmall)
                .clip(shape = CircleShape)
                .background(color)
        )
    }
}

// 1-Preview Annotation

@Preview(
    name = "CircleDotPreview",
    showBackground = true,
)
// 2- Composable for the preview
@Composable
fun CircleDotPreview() {
    //    3-Theme
    FocusTimerTheme {
        //        4-Composable to preview
        CircleDot(
            color = MaterialTheme.colorScheme.primary,
        )
    }
}

