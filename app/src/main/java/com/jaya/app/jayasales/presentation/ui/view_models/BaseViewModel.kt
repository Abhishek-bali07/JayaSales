package com.jaya.app.jayasales.presentation.ui.view_models


import androidx.lifecycle.ViewModel
import com.jaya.app.core.utils.helper.AppNavigator
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class BaseViewModel @Inject constructor(
    val appNavigator: AppNavigator,

) : ViewModel(){



}