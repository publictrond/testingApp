import com.trondvalen.Role
import com.trondvalen.User
import com.trondvalen.UserRole

class BootStrap {

    def init = { servletContext ->
        if (User.count() == 0) {
            def adminRole = new Role(authority: 'ROLE_ADMIN').save(flush: true)
            def userRole = new Role(authority: 'ROLE_USER').save(flush: true)

            def testUser1 = new User(username: 'trond', enabled: true, password: 'trond')
            testUser1.save(flush: true)
            UserRole.create testUser1, userRole, true
            def testUser2 = new User(username: 'anja', enabled: true, password: 'anja')
            testUser2.friends = [testUser1]
            testUser2.save(flush: true)
            UserRole.create testUser2, userRole, true
            def testUser3 = new User(username: 'terje', enabled: true, password: 'terje')
            testUser3.save(flush: true)
            UserRole.create testUser3, userRole, true
            def testUser4 = new User(username: 'admin', enabled: true, password: 'admin')
            testUser4.save(flush: true)
            UserRole.create testUser4, adminRole, true

            assert User.count() == 4
            assert Role.count() == 2
            assert UserRole.count() == 4
        }
    }
    def destroy = {
    }
}
