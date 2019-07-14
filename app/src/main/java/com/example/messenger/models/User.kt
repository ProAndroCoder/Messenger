package com.example.messenger.models

class User(val profileImageUrl: String, val uid: String, val username: String) {
    constructor() : this("", "", "")
}