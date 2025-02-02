package stevens.software.spendless

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable
import stevens.software.spendless.registration.create_pin.CreatePinScreen
import stevens.software.spendless.registration.RegistrationScreen

@Serializable
object Registration

@Serializable
object CreatePin

@Composable
fun MainNavController() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Registration
    ) {
        composable<Registration>{
            RegistrationScreen(
                onNextClicked = { navController.navigate(CreatePin) }
            )
        }
        composable<CreatePin>{
            CreatePinScreen()
        }
    }
}