import { Button, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import {BottomNavigator} from '../components/'
// import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack'
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs';
import { Home, Splash, Feed, Akun, LoginPage, Login, Signup, Pesan, Scan } from '../pages'

const Stack = createNativeStackNavigator();
const Tab = createBottomTabNavigator();

const MainApp = () => {
    return (
        <Tab.Navigator tabBar={props => <BottomNavigator {...props} />}>
            <Tab.Screen name="Home" component={Home} options={{ headerShown: true }}/>
            <Tab.Screen name="Feed" component={Feed} />
            <Tab.Screen name="Scan" component={Scan} />
            <Tab.Screen name="Pesan" component={Pesan} />
            <Tab.Screen name="Akun" component={Akun} />
        </Tab.Navigator>
    )
}
const Router = () => {
    return (
        <Stack.Navigator initialRouteName='Splash'>
            <Stack.Screen name="Splash" component={Splash} options={{ headerShown: false }} />
            <Stack.Screen name="LoginPage" component={LoginPage} options={{ headerShown: false }} />
            <Stack.Screen name="MainApp" component={MainApp} options={{ headerShown: false }} />
            <Stack.Screen name="Login" component={Login} options={{ headerShown: false }} />
            <Stack.Screen name="Signup" component={Signup} options={{ headerShown: false }} />
        </Stack.Navigator>
    )
}

export default Router

const styles = StyleSheet.create({})