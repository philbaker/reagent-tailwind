# reagent-tailwind

A starting point with Reagent and Tailwind.

## Watch (dev)
- Shadow: `npm run shadow:watch`
- Tailwind: `npm run tailwind:watch`

## Release (prod)
- Shadow: `npm run shadow:release`
- Tailwind: `npm run tailwind:release`

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
