package stevens.software.spendless.registration

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import stevens.software.spendless.R
import stevens.software.spendless.ui.theme.extendedColours

@Composable
fun CreatePinScreen() {
    Column(
        modifier = Modifier
            .safeDrawingPadding()
            .fillMaxSize()
            .padding(horizontal = 26.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.size(36.dp))
        Image(
            painter = painterResource(R.drawable.spend_less_logo),
            contentDescription = null,
        )
        Spacer(Modifier.size(20.dp))
        Text(
            text = stringResource(R.string.create_pin_title),
            style = MaterialTheme.typography.headlineMedium,
            color = MaterialTheme.colorScheme.onSurface
        )
        Spacer(Modifier.size(8.dp))
        Text(
            text = stringResource(R.string.create_pin_subtitle),
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
        Spacer(Modifier.size(36.dp))
        PasswordDots()
        Spacer(Modifier.size(32.dp))
        Keypad()
    }
}

@Composable
fun PasswordDots(){
    Row(
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        repeat(5) {
            PasswordDot()
        }
    }
}

@Composable
fun PasswordDot(){
    val dotColour = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.12f)
    Canvas(
        modifier = Modifier.size(18.dp)
    ) {
        drawCircle(color = dotColour)
    }
}

@Composable
fun Keypad(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            KeypadButton(number = "1")
            KeypadButton(number = "2")
            KeypadButton(number = "3")
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            KeypadButton(number = "4")
            KeypadButton(number = "5")
            KeypadButton(number = "6")
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            KeypadButton(number = "7")
            KeypadButton(number = "8")
            KeypadButton(number = "9")
        }
        Row {
            KeypadButton(number = "0")
        }
    }
}

@Composable
fun KeypadButton(
    number: String,
){
    Button(
        onClick = {},
        modifier = Modifier.size(108.dp, 108.dp),
        shape = RoundedCornerShape(32.dp),
        colors = ButtonDefaults.buttonColors().copy(
            containerColor = MaterialTheme.extendedColours.primaryFixed
        )
    ) {
        Text(
            text = number,
            style = MaterialTheme.typography.headlineLarge,
            color = MaterialTheme.extendedColours.onPrimaryFixed
        )
    }
}

@Composable
@Preview(showSystemUi = true)
fun CreatePinScreenPreview(){
    CreatePinScreen()
}
