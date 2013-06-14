class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

        "/" (controller:"user", action:"/index")
        "/status" (view:"/status")
		"500"(view:'/error')
	}
}
