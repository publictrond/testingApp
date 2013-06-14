package com.trondvalen

import grails.plugins.springsecurity.Secured

@Secured(['ROLE_USER'])
class UserController {

    def springSecurityService

    def index() {
        def u = User.findByUsername(springSecurityService.currentUser.username)
        ["friends": u.friends]
    }
}
