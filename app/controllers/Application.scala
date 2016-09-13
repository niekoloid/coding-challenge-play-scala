package controllers

import play.api._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
 
class Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  // GET /transactionservice/transaction/$transaction_id
  def getTransaction(transaction_id:Long) = Action {	
    Ok(views.html.index("get id: " + transaction_id))
  }

  // PUT /transactionservice/transaction/$transaction_id
  def putTransaction(transaction_id:Long) = Action {	
    Ok(views.html.index("put id: " + transaction_id))
  }

  // GET /transactionservice/types/$type
  def getTypes(`type`:String) = Action {	
    Ok(views.html.index("type: " + `type`))
  }

  // GET /transactionservice/sum/$transaction_id
  def getSum(transaction_id:Long) = Action {	
    Ok(views.html.index("transaction_id: " + transaction_id))
  }

}
