(defproject clojureapp "0.1.0-SNAPSHOT"
    :plugins [[lein-ring "0.7.5"]]
    :dependencies [[org.clojure/clojure "1.5.1"]
                   [http-kit "2.1.12"]]
    local-repo ~(System/getenv "OPENSHIFT_DATA_DIR")
    :main webapp)
