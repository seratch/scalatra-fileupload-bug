package controller

import skinny._
import skinny.controller.AssetsController

object Controllers {

  def mount(ctx: ServletContext): Unit = {
    root.mount(ctx)
    AssetsController.mount(ctx)
  }

  object root extends RootController with Routes {
    get("/")(index).as('index)
    post("/")(index).as('index)
  }
}

