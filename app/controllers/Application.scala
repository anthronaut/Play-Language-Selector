package controllers

import play.api._
import play.api.mvc._
import play.i18n.Lang

object Application extends Controller with CookieLang {

  def index = Action { implicit request =>
    Ok(views.html.index())
  }


}
