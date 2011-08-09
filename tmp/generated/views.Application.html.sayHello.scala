
                    package views.Application.html

                    import play.templates._
                    import play.templates.TemplateMagic._
                    import views.html._

                    object sayHello extends BaseScalaTemplate[Html,Format[Html]](HtmlFormat) {

                        def apply/*1.2*/(name:String):Html = {
                            try {
                                _display_ {

format.raw/*1.15*/("""
 
""")+_display_(/*3.2*/main(title = "Hello")/*3.23*/ {format.raw/*3.25*/("""
    
    <h1>Hello """)+_display_(/*5.16*/(name ?: "Guest"))+format.raw/*5.33*/("""!</h1>
    
    <a href="""")+_display_(/*7.15*/action(controllers.Application.index))+format.raw/*7.52*/("""">Back to form</a>
    
""")})+format.raw/*9.2*/("""
""")}
                            } catch {
                                case e:TemplateExecutionError => throw e
                                case e => throw Reporter.toHumanException(e)
                            }
                        }

                    }

                
                /*
                    -- GENERATED --
                    DATE: Wed Aug 10 00:22:58 JST 2011
                    SOURCE: /app/views/Application/sayHello.scala.html
                    HASH: 29fd1644abf3bbab309a16ef7bb41c1b2738f6bf
                    MATRIX: 332->1|452->14|481->18|510->39|530->41|577->62|614->79|666->105|723->142|775->167
                    LINES: 10->1|14->1|16->3|16->3|16->3|18->5|18->5|20->7|20->7|22->9
                    -- GENERATED --
                */
            
