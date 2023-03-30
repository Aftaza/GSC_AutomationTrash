import 'react-native-gesture-handler'
import { createNativeStackNavigator } from '@react-navigation/native-stack'
import { StatusBar, StyleSheet, Text, View, Button } from 'react-native'
import React, { useEffect} from 'react'
import { NavigationContainer } from '@react-navigation/native'
import Router from './router'

const App = () => {
  return (
    <NavigationContainer>
    <Router />
    </NavigationContainer>
    // <View>
    //   <Text>App test</Text>
    // </View>
  )
}

export default App

const styles = StyleSheet.create({})