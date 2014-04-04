(defproject my-project "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2202"]]
  :plugins [[lein-cljsbuild "1.0.3"]]
  :hooks [leiningen.cljsbuild]
  :source-paths ["src"]
  :cljsbuild {
    :builds {
      :main {
        :source-paths ["src"]
        :compiler {:output-to "out/cljs.js"
                   :optimizations :advanced
                   :pretty-print true}}}})

