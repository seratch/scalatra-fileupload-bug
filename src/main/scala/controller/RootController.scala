package controller

import skinny._
import skinny.controller.feature._

class RootController extends SkinnyServlet with FileUploadFeature {

  def index = {
    println(multiParams)
    render("/root/index")
  }

}

