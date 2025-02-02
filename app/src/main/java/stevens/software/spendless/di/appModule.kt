package stevens.software.spendless.di

import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import stevens.software.spendless.registration.create_pin.CreatePinViewModel

val appModule = module {
    viewModelOf(::CreatePinViewModel)
}