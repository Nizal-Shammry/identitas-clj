(defproject identitas "0.1.0-SNAPSHOT"
  :description "Mechanisms for generating and manipulating identifiers."
  :url "https://github.com/phillord/identitas"
  :dependencies [[org.clojure/clojure "1.8.0"]
                [uk.org.russet/identitas-j "0.1"]]
  :repositories [["local" {:url ~(str (.toURI (java.io.File. "0.1")))}]]
  :main ^:skip-aot identitas.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
