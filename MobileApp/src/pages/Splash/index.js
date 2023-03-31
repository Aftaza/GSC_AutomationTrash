import { ImageBackground, StyleSheet, Text, View } from 'react-native'
import React, { useEffect } from 'react'
import { BackgroundLogo, Logo, Rectangle1, Rectangle3 } from '../../assets'
import { Image } from 'react-native-svg'

const Splash = ({ navigation }) => {

  useEffect(() => {
    setTimeout(() => {
      navigation.replace('LoginPage');
    }, 3000)
  }, [navigation]);

  return (
    <ImageBackground source={BackgroundLogo} style={styles.background}>
      <ImageBackground source={Logo} style={styles.logo}>
      </ImageBackground>
    </ImageBackground>
  )
}

export default Splash

const styles = StyleSheet.create({
  background: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center'
  },
  logo: {
    width: 300,
    height: 300
  }
})