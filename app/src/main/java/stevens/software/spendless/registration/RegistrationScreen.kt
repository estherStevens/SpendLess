package stevens.software.spendless.registration

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import stevens.software.spendless.Greeting

@Composable
fun RegistrationScreen() {
    Scaffold(modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.primary)) { innerPadding ->
        Greeting(
            name = "Android",
            modifier = Modifier.padding(innerPadding),
        )
    }
}