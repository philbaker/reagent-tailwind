# reagent-tailwind

A starting point with Reagent and Tailwind.

## Startup

- Build/REPL: `npx shadow-cljs watch frontend`
- CSS dev: `npx tailwindcss -i ./src/css/app.css -o ./public/app.css --watch`
- CSS prod: `npx tailwindcss -o ./public/app.css --minify`

## Tailwind class autocomplete via coc.nvim

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
