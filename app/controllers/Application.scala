package controllers

import play.api._
import play.api.mvc._
import play.api.libs.json.Json

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  // PUT /transactionservice/transaction/$transaction_id
  def putTransaction(transaction_id:Long) = Action {  request =>

    (request.body / "tp").asOpt[String].map{ tp =>

      Ok(Json.toJson(Map("status"->"OK", "message"->("Hello" + tp))))

    }.getOrElse{

      BadRequest(Json.toJson(Map("status"->"NG", "message"->"Missing parameter [tp]")))
    }

  }

  // GET /transactionservice/transaction/$transaction_id
  def getTransaction(transaction_id:Long) = Action {	
    
    Ok(views.html.index("get id: " + transaction_id))
  }

  // GET /transactionservice/types/$type
  def getTypes(tp:String) = Action {	
    Ok(views.html.index("type: " + tp))
  }

  // GET /transactionservice/sum/$transaction_id
  def getSum(transaction_id:Long) = Action {	
    Ok(views.html.index("transaction_id: " + transaction_id))
  }

}
