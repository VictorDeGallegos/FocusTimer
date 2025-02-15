package mx.com.vhgallegosm.focustimer.presentation.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import mx.com.vhgallegosm.focustimer.R
import mx.com.vhgallegosm.focustimer.presentation.theme.FocusTimerTheme

@Composable
fun BorderedIcon(
    modifier: Modifier = Modifier,
    @DrawableRes icon: Int,
    onTap: () -> Unit = {}
) {
    Icon(
        modifier = modifier
            .size(FocusTimerTheme.dimens.iconSizeNormal)
            .border(
                width = FocusTimerTheme.dimens.borderNormal,
                color = MaterialTheme.colorScheme.primary,
                shape = CircleShape
            )
            .padding(FocusTimerTheme.dimens.paddingNormal)
            .clickable { onTap() },
        imageVector = ImageVector.vectorResource(id = icon),
        contentDescription = null,
        tint = MaterialTheme.colorScheme.primary
    )
}

// 1-Preview Annotation
@Preview(
    name = "BorderedIconPreview",
    showBackground = true,
)
// 2- Composable for the preview
@Composable
fun BorderedIconPreview() {
    //    3-Theme
    FocusTimerTheme {
        //        4-Composable to preview
        BorderedIcon(
            icon = R.drawable.ic_launcher_background
        )
    }
}