import { ImageBackground, StyleSheet, Text, View } from 'react-native'
import React, { useEffect } from 'react'
import { BackgroundLogo, BiruGelap, pagePutih, welcomeTo } from '../../assets'
import { Image } from 'react-native-svg'

const LoginPage = ({ navigation }) => {

    // useEffect(() => {
    //     setTimeout(() => {
    //         navigation.replace('MainApp');
    //     }, 3000)
    // }, [navigation]);

    return (
        <ImageBackground source={BackgroundLogo} style={styles.first} onPress={() => navigation.navigate('Signup')} >
            <ImageBackground source={pagePutih} style={styles.second}>
               <ImageBackground source={welcomeTo} style={styles.welcome}/>
               <ImageBackground source={BiruGelap} style={styles.kolom}>
               <ImageBackground source={BiruGelap} style={styles.dlmkolom}>
                <View>
                    <Text onPress={() => navigation.navigate('Signup')}>GET STARTED</Text>
                    {/* <Button onPress={() => navigation.navigate('Signup')} title="Neead an account?"/> */}
                </View>
               </ImageBackground>
               </ImageBackground>
               <ImageBackground source={pagePutih} style={styles.bwhkolom}>
                <View>
                    <Text onPress={() => navigation.navigate('Login')}>ALREADY HAVE AND ACCOUNT? LOGIN</Text>
                    {/* <Button onPress={() => navigation.navigate('Signup')} title="Neead an account?"/> */}
                </View>
               </ImageBackground>
            </ImageBackground>
        </ImageBackground>
    )
}

export default LoginPage

const styles = StyleSheet.create({
    first: {
        flex: 1,
        alignItems: 'center',
        justifyContent: 'center'
    },
    second: {
        marginTop: 700,
        width: 477,
        height: 500,
        borderRadius: 10,
        borderLeftWidth:0,
        borderWidth:10,
        borderColor: '#fff'
    },
    welcome: {
        marginTop: 100,
        marginLeft: 160,
        width: 152,
        height: 20
    },
    subheadline: {
        fontWeight: 500
    },
    kolom: {
        marginTop: 100,
        marginLeft: 160,
        width: 170,
        height: 41,
        borderRadius: 5,
        borderLeftWidth:0,
        backgroundColor: 'rgba(4, 118, 175, 0.50)',
        borderWidth:1,
        borderColor: '#0476af'
    },
    bwhkolom: {
        marginTop: 5,
        marginLeft: 110,
        width: 300,
        height: 41
    },
    dlmkolom: {
        marginTop: 8,
        marginLeft: 35,
        width: 100,
        height: 21,
        backgroundColor: 'rgba(4, 118, 175, 0.50)',
        borderColor: '#0476af'
    }

    
})