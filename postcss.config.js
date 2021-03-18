const purgecss = require('@fullhuman/postcss-purgecss')
const cssnano = require('cssnano')

module.exports = {
  plugins: [
    require('tailwindcss'),
    process.env.NODE_ENV === 'production' ? require('autoprefixer') : null,
    process.env.NODE_ENV === 'production'
      ? cssnano({ preset: 'default' })
      : null,
    process.env.NODE_ENV === 'production'
    ? purgecss({
        content: ['./src/**/*.cljs', './public/js/*.js'],
        defaultExtractor: content => content.match(/[\w-/:]+(?<!:)/g) || []
      })
    : null
  ]
}
