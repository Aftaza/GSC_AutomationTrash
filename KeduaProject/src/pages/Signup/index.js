import { Button, StyleSheet, Text, View } from 'react-native'
import React, { useEffect } from 'react'
import { PageAbu, PagePutih } from '../../assets'
import { Image } from 'react-native-svg'

const Signup = ({ navigation }) => {
    return(
        <View>
            <Text>Signup Page</Text>
            <Button onPress={() => navigation.navigate('Login')} title="Neead to Login?"/>
        </View>
    )
}

export default Signup

const styles = StyleSheet.create({})
