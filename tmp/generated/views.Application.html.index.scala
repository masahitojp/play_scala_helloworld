
                    package views.Application.html

                    import play.templates._
                    import play.templates.TemplateMagic._
                    import views.html._

                    object index extends BaseScalaTemplate[Html,Format[Html]](HtmlFormat) {

                        def apply():Html = {
                            try {
                                _display_ {

format.raw/*1.1*/("""

""")+_display_(/*3.2*/main(title = "Home")/*3.22*/ {format.raw/*3.24*/("""
    <form action="""")+_display_(/*4.20*/action(controllers.Application.sayHello))+format.raw/*4.60*/("""" method="GET">
        <input type="text" name="myName" />
        <input type="submit" value="Say hello!" />
    </form>
""")})}
                            } catch {
                                case e:TemplateExecutionError => throw e
                                case e => throw Reporter.toHumanException(e)
                            }
                        }

                    }

                
                /*
                    -- GENERATED --
                    DATE: Wed Aug 10 00:34:08 JST 2011
                    SOURCE: /app/views/Application/index.scala.html
                    HASH: 6b3c311a82be9010b76cb8cba02cc7319c1ba69d
                    MATRIX: 430->0|458->3|486->23|506->25|552->45|612->85
                    LINES: 14->1|16->3|16->3|16->3|17->4|17->4
                    -- GENERATED --
                */
            
