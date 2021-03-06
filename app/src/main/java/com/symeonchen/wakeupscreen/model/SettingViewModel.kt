package com.symeonchen.wakeupscreen.model

import androidx.lifecycle.ViewModel
import com.symeonchen.wakeupscreen.data.ScLiveData
import com.symeonchen.wakeupscreen.utils.DataInjection

class SettingViewModel : ViewModel() {

    var switchOfApp: ScLiveData<Boolean> = ScLiveData<Boolean>()
        .apply {
            setValue(DataInjection.switchOfApp)
        }

    var switchOfProximity: ScLiveData<Boolean> = ScLiveData<Boolean>()
        .apply {
            setValue(DataInjection.switchOfProximity)
        }

    var timeOfWakeUpScreen: ScLiveData<Long> = ScLiveData<Long>()
        .apply {
            setValue(DataInjection.milliSecondOfWakeUpScreen)
        }

    var fakeSwitchOfBatterySaver: ScLiveData<Boolean> = ScLiveData<Boolean>()
        .apply {
            setValue(DataInjection.fakeSwitchOfBatterySaver)
        }

    var switchOfDebugMode: ScLiveData<Boolean> = ScLiveData<Boolean>()
        .apply {
            setValue(DataInjection.switchOfDebugMode)
        }

    init {

        switchOfApp.listener = object : ScLiveData.OnLiveDataValueInput<Boolean> {
            override fun onValueInput(value: Boolean) {
                DataInjection.switchOfApp = value
            }
        }

        switchOfProximity.listener = object :
            ScLiveData.OnLiveDataValueInput<Boolean> {
            override fun onValueInput(value: Boolean) {
                DataInjection.switchOfProximity = value
            }
        }

        timeOfWakeUpScreen.listener = object : ScLiveData.OnLiveDataValueInput<Long> {
            override fun onValueInput(value: Long) {
                DataInjection.milliSecondOfWakeUpScreen = value
            }
        }

        fakeSwitchOfBatterySaver.listener = object :
            ScLiveData.OnLiveDataValueInput<Boolean> {
            override fun onValueInput(value: Boolean) {
                DataInjection.fakeSwitchOfBatterySaver = value
            }
        }

        switchOfDebugMode.listener = object :
            ScLiveData.OnLiveDataValueInput<Boolean> {
            override fun onValueInput(value: Boolean) {
                DataInjection.switchOfDebugMode = value
            }
        }

    }

}