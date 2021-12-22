# reagent-tailwind

A starting point with reframe and tailwind (plus purgecss to remove unused CSS).

## Startup

- Build/REPL: `npx shadow-cljs watch frontend` or `iced repl frontend`
- CSS: `npm run watch` or `npm run build` or `npm run build-prod`

## Taliwind intellisense support

```
    "tailwindCSS.includeLanguages": {
        "clojure": "html"
    },
    "[clojure]": {
        "editor.snippetSuggestions": "bottom",
        "tailwindCSS.experimental.classRegex": [
            [
                ":\\w+([^\\s]*)",
                "\\.([^\\.]*)"
            ],
        ]
    },
```

### References
- https://github.com/jacekschae/shadow-reagent
- https://flaviocopes.com/tailwind-setup/
