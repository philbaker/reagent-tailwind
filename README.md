# reagent-tailwind

A starting point with Reagent and Tailwind.

## Startup

- Build/REPL: `npx shadow-cljs watch frontend`
- CSS dev: `npx tailwindcss -i ./src/css/app.css -o ./public/app.css --watch`
- CSS prod: `npx tailwindcss -o ./public/app.css --minify`

## Tailwind intellisense support

```
 "tailwindCSS.experimental.classRegex": [                                                       
    ":class\\s+\"([^\"]*)\"",                                                                    
    ":[\\w-.#>]+\\.([\\w-]*)"                                                                    
  ],                                                                                             
  "tailwindCSS.includeLanguages": {                                                              
    "clojure": "html"                                                                            
  }   
```

### References
- https://github.com/jacekschae/shadow-reagent
- https://flaviocopes.com/tailwind-setup/
- https://github.com/tailwindlabs/tailwindcss-intellisense/issues/400#issuecomment-1218494303
