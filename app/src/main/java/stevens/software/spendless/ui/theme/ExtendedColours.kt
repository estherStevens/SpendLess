package stevens.software.spendless.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color

data class ExtendedColors(
    val success: Color,
    val primaryFixed: Color,
    val onPrimaryFixed: Color,
    val onPrimaryFixedVariant: Color,
    val secondaryFixed: Color,
    val secondaryFixedDim: Color,
)

val extendedColors = ExtendedColors(
    success = Success,
    primaryFixed = PrimaryFixed,
    onPrimaryFixed = OnPrimaryFixed,
    onPrimaryFixedVariant = OnPrimaryFixedVariant,
    secondaryFixed = SecondaryFixed,
    secondaryFixedDim = SecondaryFixedDim
)

val localExtendedColors = compositionLocalOf { extendedColors }

val MaterialTheme.extendedColours: ExtendedColors
    @Composable
    @ReadOnlyComposable
    get() = localExtendedColors.current
