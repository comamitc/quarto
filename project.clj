(defproject quarto "0.1.0-SNAPSHOT"
  :description "Multiplayer game of Quarto"
  :url "https://github.com/comamitc/quarto"
  :license {
    :name "MIT License"
    :url "https://github.com/comamitc/quarto/blob/master/LICENSE"
    :distribution :repo}

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.7.228"]
                 [org.clojure/core.async "0.2.374"]
                 [cljsjs/snapsvg "0.4.1-0"]]

  :plugins [[lein-cljsbuild "1.1.2"]]

  :source-paths ["src"]

  :cljsbuild { 
    :builds {
      :client {
        :source-paths ["src/client"]
        :compiler {
          :output-to "public/js/client.js"
          :output-dir "public/out"
          :optimizations :whitespace}}

      :client-adv {
        :source-paths ["src/client"]
        :compiler {
          ;; :externs ["externs/jquery-1.9.js" "externs/socket.io.js"]
          :output-to "public/js/client.min.js"
          :optimizations :advanced
          :pretty-print false}}

     :server {
      :source-paths ["src/server"]
      :compiler {
        :language-in :ecmascript5
        :language-out :ecmascript5
        :target :nodejs
        :output-to "server.js"
        :optimizations :simple}}}})
