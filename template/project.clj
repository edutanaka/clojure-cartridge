(defproject clojureapp "0.1.0-SNAPSHOT"
    :plugins [[lein-ring "0.7.5"]]
    :dependencies [[org.clojure/clojure "1.7.0"]
                   [http-kit "2.1.18"]]
    :local-repo ~(System/getenv "M2_REPO")
    :main webapp)
