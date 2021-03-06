package com.symeonchen.wakeupscreen.utils

import com.symeonchen.wakeupscreen.data.ScConstant.BATTERY_SAVER_FAKE_SWITCH
import com.symeonchen.wakeupscreen.data.ScConstant.CUSTOM_STATUS
import com.symeonchen.wakeupscreen.data.ScConstant.DEBUG_MODE_SWITCH
import com.symeonchen.wakeupscreen.data.ScConstant.DEFAULT_BATTERY_SAVER
import com.symeonchen.wakeupscreen.data.ScConstant.DEFAULT_SWITCH_OF_APP
import com.symeonchen.wakeupscreen.data.ScConstant.DEFAULT_SWITCH_OF_DEBUG_MODE
import com.symeonchen.wakeupscreen.data.ScConstant.DEFAULT_SWITCH_OF_PROXIMITY
import com.symeonchen.wakeupscreen.data.ScConstant.DEFAULT_TIME_OF_WAKE_UP_SCREEN_MILLISECONDS
import com.symeonchen.wakeupscreen.data.ScConstant.DEFAULT_VALUE_OF_PROXIMITY
import com.symeonchen.wakeupscreen.data.ScConstant.PROXIMITY_STATUS
import com.symeonchen.wakeupscreen.data.ScConstant.PROXIMITY_SWITCH
import com.symeonchen.wakeupscreen.data.ScConstant.WAKE_SCREEN_SECOND
import com.tencent.mmkv.MMKV

object DataInjection {

    var switchOfApp: Boolean
        get() {
            return MMKV.defaultMMKV().getBoolean(CUSTOM_STATUS, DEFAULT_SWITCH_OF_APP)
        }
        set(value) {
            MMKV.defaultMMKV().putBoolean(CUSTOM_STATUS, value)
        }

    var milliSecondOfWakeUpScreen: Long
        get() {
            return MMKV.defaultMMKV().getLong(WAKE_SCREEN_SECOND, DEFAULT_TIME_OF_WAKE_UP_SCREEN_MILLISECONDS)
        }
        set(millisSec) {
            if (millisSec < 0) {
                return
            }
            MMKV.defaultMMKV().putLong(WAKE_SCREEN_SECOND, millisSec)
        }

    var statueOfProximity: Int
        get() {
            return MMKV.defaultMMKV().getInt(PROXIMITY_STATUS, DEFAULT_VALUE_OF_PROXIMITY)

        }
        set(state) {
            MMKV.defaultMMKV().putInt(PROXIMITY_STATUS, state)
        }


    var switchOfProximity: Boolean
        get() {
            return MMKV.defaultMMKV().getBoolean(PROXIMITY_SWITCH, DEFAULT_SWITCH_OF_PROXIMITY)
        }
        set(switch) {
            MMKV.defaultMMKV().putBoolean(PROXIMITY_SWITCH, switch)
        }

    var fakeSwitchOfBatterySaver: Boolean
        get() {
            return MMKV.defaultMMKV().getBoolean(BATTERY_SAVER_FAKE_SWITCH, DEFAULT_BATTERY_SAVER)
        }
        set(value) {
            MMKV.defaultMMKV().putBoolean(BATTERY_SAVER_FAKE_SWITCH, value)
        }

    var switchOfDebugMode: Boolean
        get() {
            return MMKV.defaultMMKV().getBoolean(DEBUG_MODE_SWITCH, DEFAULT_SWITCH_OF_DEBUG_MODE)
        }
        set(value) {
            MMKV.defaultMMKV().putBoolean(DEBUG_MODE_SWITCH, value)
        }
}