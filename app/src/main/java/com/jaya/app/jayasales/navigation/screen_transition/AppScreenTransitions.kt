package com.jaya.app.jayasales.navigation.screen_transition

import androidx.compose.animation.*
import androidx.compose.animation.core.tween
import androidx.navigation.NavBackStackEntry


@OptIn(ExperimentalAnimationApi::class)
sealed class AppScreenTransitions<T> {
    object ScreenEnterTransition : AppScreenTransitions<AnimatedContentScope>() {
        operator fun invoke(backStackEntry: NavBackStackEntry): EnterTransition {
            return when(backStackEntry.destination.route) {
                else -> {
                    slideInHorizontally(
                        initialOffsetX = { 300 },
                        animationSpec = tween(300)
                    ) + fadeIn(animationSpec = tween(300))
                }
            }
        }
    }

    object ScreenPopEnterTransition :
        AppScreenTransitions<AnimatedContentScope>() {
        operator fun invoke(backStackEntry: NavBackStackEntry): EnterTransition {
            return when(backStackEntry.destination.route) {
                else -> {
                    slideInHorizontally(
                        initialOffsetX = { 300 },
                        animationSpec = tween(300)
                    ) + fadeIn(animationSpec = tween(300))
                }
            }
        }
    }

    object ScreenExitTransition : AppScreenTransitions<AnimatedContentScope>() {
        operator fun invoke(backStackEntry: NavBackStackEntry): ExitTransition {
            return when(backStackEntry.destination.route) {
                else -> {
                    slideOutHorizontally(
                        targetOffsetX = { -300 },
                        animationSpec = tween(300)
                    ) + fadeOut(animationSpec = tween(300))
                }
            }
        }
    }

    object ScreenPopExitTransition :
        AppScreenTransitions<AnimatedContentScope>() {
        operator fun invoke(backStackEntry: NavBackStackEntry): ExitTransition {
            return when(backStackEntry.destination.route) {
                else -> {
                    slideOutHorizontally(
                        targetOffsetX = { -300 },
                        animationSpec = tween(300)
                    ) + fadeOut(animationSpec = tween(300))
                }
            }
        }
    }

}
