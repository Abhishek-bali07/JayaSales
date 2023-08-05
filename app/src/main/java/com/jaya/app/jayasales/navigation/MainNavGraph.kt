package com.jaya.app.jayasales.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.jaya.app.core.common.constants.Destination
import com.jaya.app.core.utils.helper.NavigationIntent
import com.jaya.app.jayasales.navigation.screen_transition.AppScreenTransitions
import kotlinx.coroutines.channels.Channel

@Composable
fun MainNavGraph(
    navHostController: NavHostController,
    navigationChannel: Channel<NavigationIntent>,
    paddingValues: PaddingValues,
   // baseViewModel: BaseViewModel

){
    navHostController.NavEffects(navigationChannel)
    AppNavHost(
            navController = navHostController,
            startDestination = Destination.NONE,
            modifier = Modifier.padding(paddingValues),
            enterTransition = AppScreenTransitions.ScreenEnterTransition,
            popEnterTransition = AppScreenTransitions.ScreenPopEnterTransition,
            exitTransition = AppScreenTransitions.ScreenExitTransition,
            popExitTransition = AppScreenTransitions.ScreenPopExitTransition,
        ){

       /* composable(destination = Destination.SplashScreen){
            SplashScreen()
        }*/


    }
}