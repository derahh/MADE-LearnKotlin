package com.derahh.myviewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    companion object {
        private const val API_KEY = "f37c56e150010286197fb57628c9c35d"
    }
    val listWeathers = MutableLiveData<ArrayList<WeatherItems>>()

    internal fun setWeather(cities: String) {
        //request API
    }

    internal fun getWeather(): LiveData<ArrayList<WeatherItems>> {
        return listWeathers
    }
}