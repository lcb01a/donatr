package donatrui

import scala.xml.Elem

object Routes {
  private def updateCurrentView(view: Elem, after: Unit => Unit) = {
    println("update view")
    States.currentView := view
    after(())
  }

  val donatableRoute: (Map[String, String]) => Unit = (params: Map[String, String]) => {
    Views.donatablesView().foreach(updateCurrentView(_, _ => States.setCurrentDonater(params("donaterId"))))
  }

  val donaterRoute: (Map[String, String]) => Unit = (_: Map[String, String]) => {
    Views.donatersView().foreach(updateCurrentView(_, _ => States.currentDonater := null))
  }

  val routes: List[(String, (Map[String, String]) => Unit)] = List(
    "/:donaterId/donatables" -> Routes.donatableRoute,
    "/" -> Routes.donaterRoute
  )
}
